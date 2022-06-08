class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        # Track current working prefix.
        prefix = ""
        word = strs[0]
        # Traverse through each character in chosen word.
        for char in word:
            # Check if other strings contain prefix.
            for word in strs:
                if word.find(prefix + char) != 0:
                    return prefix
            # Add character to working prefix.
            prefix = prefix + char
        return prefix
